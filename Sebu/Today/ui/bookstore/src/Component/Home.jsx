import React, { useEffect, useState } from 'react'
import axios from 'axios';
export default function Home() {

    // useState for state management in the functional component.,
    const[company,setCompany] = useState([]);
    {Array.isArray(company)}


    // useEffect to load the page.,
    useEffect (()=> {
        companyData();
    },[])

     // method for loding the details,
    const companyData =async () => {
        const dat =await axios.get("http://localhost:8080/getCompanyData")
        console.log(dat);
        setCompany(dat.data);
    }

        return (
            <>
            <div classNameName='container'>
                    <div classNameName='py-4'>
                    <table className="table table-hover table-border">
        <thead>
            <tr>
            <th scope="col">Company Id</th>
            <th scope="col"> Company Name</th>
            <th scope="col"> Company Address</th>
            <th scope="col"> Company Type </th>
            <th scope="col"> Company Website </th>
            </tr>
        </thead>
        <tbody>
            {
                // Object.keys(company).map((company)=>
                company.map((company,index)=>
                {
                    <tr>
                    <th scope="row" key={index}>{index+1}</th>
                    <td>ohkjsa</td>
                    <td>{company.c_Id}</td>
                    <td>{company.c_Name}</td>
                    <td>{company.c_Name}</td>
                    <td>{company.c_Address}</td>
                    <td>{company.c_Website}</td>
                    </tr>
                })
              
              
            }
           
            
        </tbody>
        </table>
                    </div>   
            </div>
            </>
  )
}
