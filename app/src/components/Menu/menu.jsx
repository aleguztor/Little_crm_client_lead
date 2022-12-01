import './menu.css';
import Cliente from "../Usuarios/Cliente";
import Contacto from "../Usuarios/Contacto";
import Oportunidades from "../Usuarios/Oportunidades";
import { FooterMio } from '../footer/FooterMio';
import { useEffect, useState } from 'react';
import { Navigate, useNavigate} from 'react-router-dom';


        

export default function Menu(){

    // const [nombre, setImageUrl] = useState(null);
    // const [Email, setEmail] = useState(null);
    // const [Date, setDate] = useState(null);
    // const [tlf, settlf] = useState(null);
    // const [numCalls, setCalls] = useState(null);

    const [getUsers= new Array, setUsers] = useState(null);

  //GET 1 USUARIO
    // useEffect(() => {
    //     fetch('http://localhost:8686/1')
    //       .then(response => response.json())
    //       .then(post=>{
    //         setImageUrl(post.name); // ⬅️ Guardar datos
    //         setEmail(post.email);
    //         setDate(post.date);
    //         settlf(post.tlf);
    //         setCalls(post.numCalls);
            // console.log(post.name);
      //   })
      // }, [])



      //GET ALL USERS
      useEffect(() => {
        fetch('http://localhost:8686/')
          .then(response => response.json())
          .then(get=>{
            setUsers(get)
         
            
        })
      }, [])
      

      //POST FORMULARIO PARA CREAR CONTACTO
      const [firstName, setFirstName] = useState("")
      const [lastName, setLastName] = useState("")
      const [emailform, setemailform] = useState("")
      const [numerotlf, setnumerotlf] = useState("")
      const [message, setMessage] = useState("");
     

      let handleSubmit = async (e) => {
        e.preventDefault();
        try {
          let res = await fetch("http://localhost:8686/", {
            method: "POST",
            headers: {
              "Content-Type": "application/json"
            },
            body: JSON.stringify({
              name: firstName,
              lastName:lastName,
              email: emailform,
              tlf:numerotlf
            })
           
          });
          let resJson = await res.json();
          if (res.status === 200) {
            setFirstName("");
            setLastName("");
            setemailform("");
            setnumerotlf("")
            setMessage("User created successfully");
            window.location.reload()
          } else {
            setMessage("Some error occured");
          }
        } catch (err) {
          console.log(err);
        }
      };
      //////////////////////////////////////////////////

     

        const navigate = useNavigate();
        
        if ( localStorage.getItem("authenticated")==false) {
           navigate("/")
        } else {
          if(getUsers!=null){
    return(
        <>
        <div>
            <h2>APP CONTACTOS</h2>
        </div>
   
        <form className='form-menu' id="form-menu-nice" onSubmit={handleSubmit}>
            <div className='form-entrada'>
            <label htmlFor=""> Nombre Cliente:</label>

            <input 
            type="text" 
            name='name' 
            value={firstName}
            onChange={(e) => setFirstName(e.target.value)}
            />

            </div>

            <div className='form-entrada'>
            <label htmlFor=""> Apellido:</label>
            <input type="text" name='lastName'  value={lastName}   onChange={(e) => setLastName(e.target.value)}/>
            </div>
            <div className='form-entrada'>


            <label htmlFor=""> Tlf:</label>
        
            <input type="number" name='tlf' value={numerotlf} onChange={(e) => setnumerotlf(e.target.value)} />

            </div>
            <div className='form-entrada'>
            <label htmlFor=""> Email:</label>
            <input type="email" name="email" value={emailform}   onChange={(e) => setemailform(e.target.value)} />
            </div>
            <div className='form-entrada'>
          <button name='nuevocliente' id="postSubmit" type="submit" > NUEVO CONTACTO</button>
          </div>
          <div className="message">{message ? <p>{message}</p> : null}</div>
        </form>

        <div id="containerlistas" className='containermenu'>

        <div id="listaContacto">

            <Contacto todos={getUsers}></Contacto>

        </div>
        <Oportunidades todos={getUsers}></Oportunidades>
        
        <Cliente todos={getUsers}></Cliente>
        </div>
        <FooterMio></FooterMio>
        </>
    );
    }
}
}
