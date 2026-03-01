import {useNavigate} from 'react-router-dom'
import {useState} from "react";

export default function MyLandingPage()
{
    const navigate = useNavigate()
    const [meal, setMeal] = useState(null);

    function suggestMeal()
    {
        fetch('http://localhost:8080/getRandomMeal')
            .then(response => response.json())
            .then(data => setMeal(data))
    }


    return(
        <div>
            <h1>Meal Tracker</h1>
            <button onClick={() => suggestMeal()}>Suggest A Meal</button>
            <button onClick={() => navigate('/meal-manager')}>Meal Manager</button>
            <button>Planning</button>
            {meal && <div>
                <h2>Meal Information</h2>
                <label>Meal Name: </label>
                <label>{meal.name}</label>
                <p>Cook Time: </p>
                <label>{meal.timeToCook}</label>
                <label>Portions Left: </label>
                <label>{meal.portionCount}</label>
            </div>}
        </div>
    );
}


