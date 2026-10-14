import React from 'react'
import { Navigate, Outlet } from 'react-router-dom';

const ProtectedRoute = () => {
  const isAuthenticated =localStorage.getItem("isAuthenticated");
  if(isAuthenticated=="true"){
    return <Outlet/>
  }
  return <Navigate to="/" replace/>
}

export default ProtectedRoute
