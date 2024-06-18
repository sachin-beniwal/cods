import React from 'react'
import './Navbar.css'
const NavBar = () => {
  return (
    <div>
      <ul>
      <li>
                sachin <br></br>
                beniwal
              </li>
      </ul>
      <div className='nav'>

            <ul>
                <li>
                  <i class="fa-solid fa-house"></i>
                  <a href='#'>Home</a>
                </li>
                <li>
                  <i class="fa-solid fa-user-graduate"></i>
                  <a href='#'>Education</a>
                </li>
                <li>
                  <i class="fa-solid fa-list-check"></i>
                  <a href='#'>Skills</a>
                  </li>
                <li>
                  <i class="fa-solid fa-diagram-project"></i>
                  <a href='#'>Courses</a>
                </li>
                <li>
                  <i class="fa-regular fa-address-card"></i>
                  <a href='#'>About Me</a>
                </li>
                <li>
                  <i class="fa-solid fa-address-book"></i>
                  <a href='#'>Contact Me</a>
                </li>
            </ul>
      </div>
    </div>
  )
}

export default NavBar