import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import LogIn from './components/LogIn/LogIn';
import Menu from './components/Menu/menu';
import { useState } from 'react';
   
function App() {
  const [validation, setvalidation] = useState(false);

  return (
    <BrowserRouter>
    <Routes>
    <Route path = "/" element={<LogIn validacion={setvalidation}/>}></Route>

    {/* <Route  path="/signin"  element={<Home/>}></Route> */}
    <Route path = "/menu" element={validation && <Menu validacion={setvalidation}/>}></Route>
    </Routes>
    
    
    </BrowserRouter>
  );
}

export default App;
