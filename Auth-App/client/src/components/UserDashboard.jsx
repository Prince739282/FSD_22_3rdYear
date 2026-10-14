import React from 'react'
import { Navigate } from 'react-router-dom'

const UserDashboard = () => {
  return (
    <div>
      <h1>user dashboard</h1>
      <Navigate to="/Logout" />
    </div>
  )
}

export default UserDashboard
