# candidate-referra# 🚀 Candidate Referral Management System

A full-stack application built using **React (Frontend)** and **Spring Boot with MongoDB (Backend)** for managing candidate referrals in an organization.

---

## 💡 Overview

The **Candidate Referral Management System** allows employees to submit candidate referrals, track their status, and manage the hiring pipeline efficiently. It includes features like:

- Add new candidate referrals  
- Update candidate status (e.g., Pending → Interviewing → Hired)  
- Delete candidates  
- Search/filter candidates by job title or status  

---

## 🧩 Features

✅ Add New Candidates  
✅ Update Candidate Status  
✅ Delete Candidates  
✅ Filter/Search Candidates  
✅ Responsive UI  
✅ RESTful API Communication  
✅ MongoDB as Database  
✅ Built with Modern Tech Stack

---

## 🛠️ Tech Stack

| Layer       | Technology             |
|-------------|------------------------|
| **Frontend** | React.js               |
| **Backend**  | Spring Boot (Java)     |
| **Database** | MongoDB                |
| **API Docs** | Swagger (Optional)     |
| **Styling**  | CSS / TailwindCSS      |

---

## 📦 Folder Structure
candidate-referral-system/
├── frontend/ # React App
│ ├── public/
│ ├── src/
│ │ ├── components/
│ │ ├── services/
│ │ └── App.js
│ └── package.json
└── backend/ # Spring Boot App
├── src/
│ ├── main/
│ │ ├── java/com/web/controller
│ │ ├── java/com/web/model
│ │ ├── java/com/web/repo
│ │ └── resources/application.properties
└── pom.xml


---

## 🚀 How to Run Locally

### 1. Clone the repo

```bash
git clone https://github.com/yourusername/candidate-referral-system.git 
cd candidate-referral-system

cd backend
./mvnw spring-boot:run
 Start Backend (Spring Boot)
bash

cd backend
./mvnw spring-boot:run
Make sure MongoDB is running locally. 

Start Frontend (React)
bash

cd ../frontend
npm install
npm start
Open http://localhost:3000 in your browser.

🧪 API Endpoints
POST
/api/candidates
Add a new candidate
GET
/api/candidates
Get all candidates
PUT
/api/candidates/{id}/status
Update candidate status
DELETE
/api/candidates/{id}
Delete a candidate

📷 Screenshots
App Screenshot

🤝 Contributing
Contributions are welcome! If you'd like to help improve this project, please read the contributing guidelines .

📜 License
This project is licensed under the MIT License – see the LICENSE file for details.

👥 Contact
Have questions? Want to collaborate?

📧 Email: gouthathatukunoori@gmail.com
🐱 GitHub: https://www.linkedin.com/in/goutham-krishna-b977a9337/
