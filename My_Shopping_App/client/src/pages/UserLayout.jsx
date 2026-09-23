import React from 'react'
import Footer from '../components/Footer';
import Header from "../components/Header";
import Home from "../components/Home";
import Navbar from "../components/Navbar";



function UserLayout() {
  return (
    <div>
        <Header/>
        <Navbar/>
        <Home/>
        <Footer/>
    </div>
  )
}

export default UserLayout