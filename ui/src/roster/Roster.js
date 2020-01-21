import React, { useState, useEffect } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles({
    table: {
        minWidth: 650,
    },
});

export default function Roster() {
    const classes = useStyles();
    const [rowNum, setRowNum] = useState(0)
    const [roster, setRoster] = useState([])
    const [header, setHeader] = useState([])
    const [data, setData] = useState([])

    useEffect(() => {
        const fetchRoster = async () => {
            const res = await fetch('./api/roster', { method: 'GET' })
            if (!res.ok) { console.error('Could not fetch /api/roster') }
            const json = await res.json()
            setRowNum(json.roster.length)
            setRoster(json.roster)
            setHeader(createHeaderArray(json.roster))
            setData(createDataArray(json.roster))
        }
        fetchRoster()
    }, [])

    const createHeaderArray = (roster) => {
        let headers = []
        if (roster.length > 0) {
            const attributes = roster[0].playerGeneralInfo
            for (const attribute in attributes) {
                headers.push(
                    <TableCell key={attribute}>{attribute}</TableCell>
                )
            }
        }
        return headers
    }

    function createHeaderRow(firstName, lastName, college, age, position) {
        return { firstName, lastName, college, age, position };
    }

    const createDataArray = (roster) => {
        let dataArray = []
        if (roster.length > 0) {
            roster.forEach((player) => {
                dataArray.push(createDataRow(
                    player.playerGeneralInfo.firstName.value,
                    player.playerGeneralInfo.lastName.value,
                    player.playerGeneralInfo.college.value,
                    player.playerGeneralInfo.age.value,
                    player.playerGeneralInfo.position.value,
                ))
            })
        }

        return dataArray
    }

    function createDataRow(firstName, lastName, college, age, position) {
        return { firstName, lastName, college, age, position };
    }

    return (
        <TableContainer component={Paper}>
            <Table className={classes.table} size="small" aria-label="a dense table">
                <TableHead>
                    <TableRow>
                        {header.length > 0 && header}
                    </TableRow>
                </TableHead>
                <TableBody>
                    {data.map(row => (
                        <TableRow key={row.name}>
                            <TableCell>{row.firstName}</TableCell>
                            <TableCell>{row.lastName}</TableCell>
                            <TableCell>{row.college}</TableCell>
                            <TableCell>{row.age}</TableCell>
                            <TableCell>{row.position}</TableCell>
                        </TableRow>
                    ))}
                </TableBody>
            </Table>
        </TableContainer>
    );
}
