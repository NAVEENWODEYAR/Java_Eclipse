import React,{Component} from 'react';
import Navbar from './Component/Navbar';
import Home from './Component/Home';

class App extends Component
 {

  render()
  {

    return(
      <>
        <Navbar/>
        <Home/>
      </>
    );
  }
}

export default App;