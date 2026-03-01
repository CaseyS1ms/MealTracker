import {useNavigate} from 'react-router-dom'
import {useState} from "react";
import './LandingPage.css'

export default function MyLandingPage() {
    const navigate = useNavigate()
    const [meal, setMeal] = useState(null);
    var time = new Date()

    function suggestMeal() {
        fetch('http://localhost:8080/getRandomMeal')
            .then(response => response.json())
            .then(data => setMeal(data))
    }

    function logPortion(id){
        fetch("http://localhost:8080/logPortion?id=" + id,{method : "PUT"})
            .then(setMeal({...meal, portionCount: meal.portionCount - 1}))
    }


    return (
        <div className={"page-container"}>
            <h1>Meal Tracker</h1>
            <div className={"left-side"}>
                <button onClick={() => suggestMeal()}>Suggest A Meal</button>
                <button onClick={() => navigate('/meal-manager')}>Meal Manager</button>
                <button>Planning</button>
            </div>
            <div className={"right-panel"}>
                <div className={"meal-card"}>

                    {meal ?
                        <div>
                            <h2>Meal Information</h2>
                            <p>Meal Name: {meal.name} </p>
                            <p>Cook Time: {meal.cookTime} minutes (Ready at {new Date(Date.now() + meal.cookTime * 60000).toLocaleTimeString([], {hour: '2-digit', minute: '2-digit'})})</p>
                            <p>Portions Left: {meal.portionCount}</p>
                            <button onClick={() => logPortion(meal.id)}> Accept </button>
                        </div>
                        : <label>Click Suggest Meal to get a recommendation</label>
                    }
                </div>
            </div>
        </div>
    );


}//end of mylandingpage function


