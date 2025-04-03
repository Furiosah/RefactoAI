#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr  2 14:40:45 2025

@author: zoey
"""
from flask import Flask, request
from camel.agents import TaskSpecifyAgent
from camel.models import ModelFactory
from camel.prompts import TextPrompt
from camel.types import ModelPlatformType, ModelType
import os


camelRefacto = Flask(__name__)

@camelRefacto.route('/refactor', methods=['POST'])
def refactor():
    data = request.get_json()

    # Retrieve token and code from the JSON data
    token = data.get('token')
    code = data.get('code')
    os.environ["OPENAI_API_KEY"] = token
    user_input = code
    
    model = ModelFactory.create(
        model_platform=ModelPlatformType.OPENAI,
        model_type=ModelType.GPT_4O_MINI,
    )

    # Create a custom prompt template
    my_prompt_template = TextPrompt(
        'Here is a task: I\'m a senior software engineer and I want to review code of a junior collegue. code is provided, please comment on it and provide refactor opinion.'
    )

    # Create a task specify agent with the custom prompt
    task_specify_agent = TaskSpecifyAgent(
        model=model, task_specify_prompt=my_prompt_template
    )
    return task_specify_agent.step(user_input).msgs[0].content

if __name__ == '__main__':
    camelRefacto.run(debug=True, host='0.0.0.0', port=5001)    
    