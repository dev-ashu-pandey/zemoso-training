// import * as React from 'react';
import { Table,TableBody,TableCell,TableContainer,TableHead,TableRow} from '@mui/material';
// import { faFilter } from "@fortawesome/free-solid-svg-icons";
import {Paper} from '@mui/material';
import candidateData from '../../../record.json'
import { useState } from 'react';
import { CandidateHeading } from '../CandidateHeading';
import './index.css'




export const CandidateTable=()=> {
    const data = candidateData;
    const [tableData, setTableData] = useState(data);
    const handleSearch = (e: any) => {
        const inpVal = (e.target.value).toLowerCase().trim();
        if (inpVal.length > 1) {
            const newTableData= data.filter(item=>{
                return (item.Name.toLowerCase()).includes(inpVal)
            })
            setTableData(newTableData);
        }
        else{
            setTableData(data);
        }
    };
  return (
        <div>
        <CandidateHeading handleChange={(e: any) => {
              handleSearch(e);
            }} />
    <TableContainer component={Paper}>
      <Table aria-label="simple table">
        <TableHead>
          <TableRow className='headRow'>
            <TableCell>NAME</TableCell>
            <TableCell align="right">ADJUDICATION</TableCell>
            <TableCell align="right">STATUS</TableCell>
            <TableCell align="right">LOCATION</TableCell>
            <TableCell align="right">DATE</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {tableData.map((row) => (
            <TableRow
              key={row.Name} 
            >
              <TableCell className='nameofPerson' component="th" scope="row">
                {row.Name}
              </TableCell>
              <TableCell align="right">{row.Adjudication}</TableCell>
              <TableCell className='status' align="right">{row.Status}</TableCell>
              <TableCell align="right">{row.Location}</TableCell>
              <TableCell align="right">{row.Date}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>

        </div>
  );
}