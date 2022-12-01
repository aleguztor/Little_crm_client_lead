import './footer.css'
import { Navigate,useNavigate } from 'react-router-dom';
export function FooterMio(props){
    const navigate = useNavigate();

    function cambiarEstado(){
       
         sessionStorage.setItem('validacion', false);
      
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