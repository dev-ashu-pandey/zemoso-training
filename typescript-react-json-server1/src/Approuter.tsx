
import {BrowserRouter,Routes, Route} from 'react-router-dom'
import { Fetch } from './Component/Fetch'
import { Add } from './Component/Add'
import { Update } from './Component/Update'
export const Approuter=()=>{
    return(
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<Fetch/>} />
                <Route path='create' element={<Add/>} />
                <Route path='update/:id' element={<Update/>} />
            </Routes>
        </BrowserRouter>
    )
}