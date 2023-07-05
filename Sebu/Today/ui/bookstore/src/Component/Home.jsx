import React, { useEffect, useState } from 'react'
import axios from 'axios';
export default function Home() {

    // useState for state management in the functional component.,
    const[company,setCompany] = useState([]);

    // useEffect to load the page.,
    useEffect (()=> {
        companyData();
    },[])

     // method for loding the details, getting the data from the database using the API
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
            Object.keys(company).length > 0 ?
            <>
                {
                    company.map((com)=>{
                        return <tr>
                            {/* <th scope="row" key={index}> {index+1}</th> */}
                            <td>{com.c_Id}</td>
                            <td>{com.c_Name}</td>
                            <td>{com.c_Address}</td>
                            <td>{com.c_Type}</td>
                            <td>{com.c_Website}</td>

                                <td>
                                    <button className='btn btn-primary mx-2'> Add  </button>
                                    <button className='btn btn-outline-warning mx-2'> Update  </button>
                                    <button className='btn btn-danger mx-2'> Delete  </button>
                                </td>
                        </tr>
                    })
                }
            </>: null
            }
           
            
        </tbody>
        </table>
                    </div>   
            </div>
            </>
  )
}
