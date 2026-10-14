import React from 'react'
import { BrowserRouter,Route,Routes } from 'react-router-dom'
import Login from './components/Login';
import Logout from "./components/Logout";

import AdminDashboard from "./components/AdminDashboard";
import UserDashboard from "./components/UserDashboard";


const App = () => {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/admin" element={<AdminDashboard />} />
          <Route path="/user" element={<UserDashboard />} />
          <Route path="/logout" element={<Logout />} />
          <Route path="*" element={<h1>Error:Page not found</h1> } />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App
