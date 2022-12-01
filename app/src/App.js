import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import LogIn from './components/LogIn/LogIn';
import Menu from './components/Menu/menu';

   
function App() {
  
  return (
    <BrowserRouter>
    <Routes>
    <Route path = "/" element={<LogIn/>}></Route>

    {/* <Route  path="/signin"  element={<Home/>}></Route> */}
    <Route path = "/menu" element={<Menu/>}></Route>
    </Routes>
    
    
    </BrowserRouter>
  );
}

export default App;
