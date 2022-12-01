import './LogIn.css';
// import './App.css';
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
export default function LogIn(){
   
    const navigate = useNavigate();
    const [username, setusername] = useState("");
    const [password, setpassword] = useState("");
   

    const users = [{ username: "soler@solera.com", password: "solera" }];
    const handleSubmit = (e) => {
    e.preventDefault();
    const account = users.find((user) => user.username === username);
    if (account && account.password === password) {
    
    navigate("/menu");
    }
    };
    return (
      <>
        <div className="logincontainer">
          <h1> Log In</h1>

          <form className="login" onSubmit={handleSubmit}>
            <div id="error"></div>
          <label>Email</label>
            <input
              type="text"
              name="Username"
              value={username}
              onChange={(e) => setusername(e.target.value)}
            />
             <label>Password</label>
            <input
              type="password"
              name="Password"
              onChange={(e) => setpassword(e.target.value)}
            />
            <input className='button' type="submit" value="Submit" />
          </form>
        </div>
      </>
    );

}
