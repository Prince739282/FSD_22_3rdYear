import React from 'react'
import { Navigate, useNavigate } from 'react-router-dom'
const Logout = () => {
    const navigate=useNavigate();
    const logout=()=>{
        localStorage.setItem("isAuthenticated");

        navigate("/",{replace:true});
    }
  return (
    <div>
      <h2>Are you sure? do you want to logout</h2>
      <button onClick={logout}>Logout</button>
    </div>
  )
}

export default Logout
