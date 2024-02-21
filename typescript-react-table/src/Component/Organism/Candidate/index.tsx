import {Box, Card, CardContent} from '@mui/material'
import { CandidateTable } from '../../Molecule/table'

export const Candidate=()=>{
    return(
        <div>
            <Box width='90vw' marginLeft='5vw'>
                <Card>
                    <CardContent>
                        
                        <CandidateTable/>
                    </CardContent>
                </Card>
            </Box>
        </div>
    )
}