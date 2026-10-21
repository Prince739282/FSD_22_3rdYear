import React from 'react'
import { Link, Navigate } from 'react-router-dom'

const UserDashboard = () => {
  return (
    <div>
      <h1>user dashboard</h1>
      <Link to="/logout">logout</Link>
      {/* <Navigate to="/Logout" /> */}
    </div>
  )
}

export default UserDashboard
