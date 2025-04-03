# RefactoAI 🚀

RefactoAI is an AI-powered code review and refactoring assistant. It helps developers analyze, optimize, and enhance their code quality using **LLM (Large Language Models)**. Whether you need syntax improvements, security checks, or performance optimizations, RefactoAI provides **intelligent suggestions** for better code.

## 🛠 Tech Stack

### **Backend**

- **Spring Boot 3.x** - Java-based RESTful API
- **Python** - AI-powered code analysis service
- **Camel-AI** - Multi-agent framework for LLM integration
- **WebClient** - Spring Boot HTTP client for API calls

### **Frontend**

- **React + Vite** - Fast and lightweight UI
- **Monaco Editor** - VS Code-like editor for code input
- **TailwindCSS** - Styling framework for a clean UI

### **Deployment**

- **Railway / Render** - Free backend hosting
- **Vercel / Netlify** - Free frontend deployment

---

## 🚀 Features

✅ **AI Code Review** - Analyze and optimize code using LLMs\
✅ **Refactoring Suggestions** - Improve readability and performance\
✅ **Security & Best Practices** - Identify vulnerabilities and code smells\
✅ **Multi-Agent Collaboration** - Different AI agents for different tasks\
✅ **Seamless API Integration** - Spring Boot + FastAPI for high performance

---

## 🎯 How to Run Locally

### **1️⃣ Clone the Repository**

```bash
git clone https://github.com/your-username/RefactoAI.git
cd RefactoAI
```

### **2️⃣ Backend Setup (Spring Boot + FastAPI)**
#### Spring Boot Server
```bash
cd backend
mvn spring-boot:run
```
#### Python script
```bash
python3 camelRefacto.py 
```

### **3️⃣ Frontend Setup (React + Vite)**
```bash
cd frontend
npm install
npm run dev
```


## 📡 API Design

### **1️⃣ Submit Code for Review**

**Endpoint:** `POST /api/code-review`

- **Request Body:**

```json
{
  "token": "OPENAI_API_KEY",
  "code": "public class Test { ... }"
}
```

- **Response:**

```
Your  class is designed to search through directories and collect files that meet certain criteria defined in the `FileFilter`. However, there are a few issues in your code that need to be addressed for it to compile and function correctly. Below, I’ll suggest some improvements and corrections.

Here’s the updated version of your `FileSearcher` class along with appropriate fixes:

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Assuming these classes/interfaces already exist
class Directory {
```
***
### 👇COMING SOON 
### **2️⃣ Check API Status**

**Endpoint:** `GET /api/status`

- **Response:**

```json
{
  "backend": "running",
  "ai_service": "running"
}
```

## 📌 Next Steps

- Integrate more LLMs for different languages
- Add a more detailed code quality metrics system
- Implement authentication for users

