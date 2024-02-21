import { Box, Card, CardContent, Stack } from "@mui/material"
type Props={
    children:React.ReactNode
}
export const MUICard=({children}:Props)=>{
    return(
        <Box marginTop='50px' marginLeft='25rem' width='30rem' height='60rem'>
            <Card>
                <CardContent>
                    <Stack spacing={3}>
                    {children}
                    </Stack>
                </CardContent>
            </Card>
        </Box>
    )
}