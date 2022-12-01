import './footer.css'
import { Navigate,useNavigate } from 'react-router-dom';
export function FooterMio(){
    const navigate = useNavigate();

    function cambiarEstado(){
       
      
      
        navigate("/");
     
        
    }
    return(
        <>
        <div className="Footer"> 
        <div>
            <p>App creada por</p>
            <p><strong>Alejandro Guzman Torres</strong></p>
        </div>
        <button id="botonlogout" type='submit' onClick={cambiarEstado}> Log out</button>
        
        </div>


        </>
    );

}