import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const Login = () => {
    const [uname,setUname]=useState("");
    const [pass,setPass]=useState("");
    const navigate =usenavigate();
    const [error,setError]=useState("");

    function handleLogin(){
        if(uname ==="admin" && pass==="manager"){
            navigate("/admin")
        }
        else if(uname==="user" && pass==="abes"){
            navigate("/user");
        }
        else{
            setError("Login failed:Check user credential")
            navigate("/")
        }
    }
  return (
    <div>
      <h1>Login page</h1>
      <h2 style={{color:"red"}}>{error}</h2>
      <form onSubmit={handleLogin}>
        Username:
        <input
          type="text"
          value={uname}
          placeholder="Enter username"
          onChange={(e) => {
            setUname(e.target.value);
          }}
        />
        <br />
        Username:
        <input
          type="password"
          value={pass}
          placeholder="Enter password"
          onChange={(e) => {
            setPass(e.target.value);
          }}
        />
        <br />
        <button>Signin</button>
      </form>
    </div>
  );
}

export default Login
