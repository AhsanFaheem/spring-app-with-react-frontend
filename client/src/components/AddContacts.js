import React, { Component } from 'react';

class AddContacts extends Component {
    submitContact(e) {
        e.preventDefault();

        let contact = {
            firstName: e.target.firstName.value,
            lastName: e.target.lastName.value,
            email: e.target.email.value

        }
        fetch("http://localhost:8080/api/contacts", {
            method: 'POST',
            headers: {
                "content-type": "application/json"
            },
            body: JSON.stringify(contact)
        }

        ).then(response => response.json());

        window.location.reload();
    }
    render() {
        return (
            <div className="row">
                <form className="col s12" onSubmit={this.submitContact.bind(this)}>
                    <div className="row">
                        <div className="input-field col s6">
                            <input name="firstName" ref="firstName" type="text" className="validate" />
                            <label htmlFor="firstName">First Name</label>
                        </div>

                        <div className="input-field col s6">
                            <input name="lastName" ref="lastName" type="text" className="validate" />
                            <label htmlFor="lastName">Last Name</label>
                        </div>


                    </div>
                    <div className="row">
                        <div className="input-field col s12">
                            <input name="email" ref="email" type="email" className="validate" />
                            <label htmlFor="email">Email</label>
                        </div>


                    </div>
                    <div className="row">
                        <button className="col s12 waves-effect waves-light btn" type='submit' name="action">Submit</button>
                    </div>
                </form>
            </div>
        )

    }

}
export default AddContacts;