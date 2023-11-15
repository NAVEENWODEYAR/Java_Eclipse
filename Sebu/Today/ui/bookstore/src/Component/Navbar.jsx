import React from 'react'

export default function Navbar() 
{
  return (
    <>
        <nav className='navbar navbar-dark bg-primary navbar-expand-lg'>
            <div className="container">
                <a href="#" className='navbar-brand'> Dream to  Work @Campus </a>
                {/* <button className='button-toggler' type='button' data-bs-toggle='collapse' data-bs-target="#navbar-supported-content" aria-controls='navbar-supported-content' aria-expanded='false' aria-label='Toggle navigation'>
                    <button className='btn-btn success'></button>
                </button> */}
                <button className='btn btn-outline-light' style={{marginLeft:'800px'}}>Add Campus</button>

            </div>
        </nav>
    </>
  )
}
