import React, { useState } from 'react'

const Login = () => {
    const [uname,setUname]=useState("");
    const [pass,setPass] =useState("");
  return (
    <div>
      <div>
        <h1>Login Page:</h1>
        <form>
          User Name:
          <input
            type="text"
            value={uname}
            placeholder="enter username"
            onChange={(e) => {
                setUname(e.target.value);
            }}
          />
          <br />
          username:
          <input
            type="password"
            value={pass}
            placeholder="enter password"
            onChange={setPass((e) => {
              setPass(e.target.value);
            })}
          />
          <br />
          Password:
        </form>
      </div>
    </div>
  );
}

export default Login
