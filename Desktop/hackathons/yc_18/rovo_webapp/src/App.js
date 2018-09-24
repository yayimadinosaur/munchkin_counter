import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
//line 5 added from fb react bootstrap site https://github.com/facebook/create-react-app/blob/master/packages/react-scripts/template/README.md#folder-structure
import { Navbar, Jumbotron, Button, Form, Col, FormGroup, FormControl, ControlLabel, InputGroup } from 'react-bootstrap';

class App extends Component {
  render() {
    return (
      <div>
		<Button>Share Experience</Button>
		<Button>Log In</Button>
		<form>
			<FormGroup>
				<ControlLabel for="exampleText">Search</ControlLabel>
				<FormControl type="text" name="Search" id="searchbar" placeholder="Search"/>
			</FormGroup>
		</form>
      </div>
    );
  }
}

export default App;
