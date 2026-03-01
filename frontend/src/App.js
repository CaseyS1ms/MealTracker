import {BrowserRouter, Routes, Route} from 'react-router-dom'
import LandingPage from './pages/LandingPage'
import MealManger from './pages/MealManager'

export default function App() {
  return (
      <BrowserRouter>
         <Routes>
             <Route path="/" element ={<LandingPage />} />
             <Route path="/meal-manager" element ={<MealManger />} />
         </Routes>
      </BrowserRouter>
  );
}

