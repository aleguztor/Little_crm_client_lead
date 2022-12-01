import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import LogIn from './components/LogIn/LogIn';
import Menu from './components/Menu/menu';
import { useEffect, useState } from 'react';
   
function App() {
 
  const [validation, setvalidation] = useState();

  useEffect(() => {
    
    if(sessionStorage.getItem('validacion')==null){

      sessionStorage.setItem('validacion',false);
      setvalidation(false);
    }
  
    if(sessionStorage.getItem('validacion')=='true'){
      setvalidation(true);
    }
    if(sessionStorage.getItem('validacion')=='false'){
      setvalidation(false);
    }
  })

  
  
console.log(validation)

  return (
    <BrowserRouter>
    <Routes>
    <Route path = "/" element={<LogIn/>}></Route>

    {/* <Route  path="/signin"  element={<Home/>}></Route> */}
    <Route path = "/menu" element={validation && <Menu/>}></Route>
    </Routes>
    
    
    </BrowserRouter>
  );
}

export default App;
