import React from 'react'
import clsx from 'clsx';
import { makeStyles, useTheme } from '@material-ui/core/styles';
import Drawer from '@material-ui/core/Drawer';
import List from '@material-ui/core/List';
import Divider from '@material-ui/core/Divider';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import IconButton from '@material-ui/core/IconButton';
import ChevronLeftIcon from '@material-ui/icons/ChevronLeft';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import InboxIcon from '@material-ui/icons/MoveToInbox';
import MailIcon from '@material-ui/icons/Mail';
import AcUnitIcon from '@material-ui/icons/AcUnit';
import AllInclusiveIcon from '@material-ui/icons/AllInclusive';

const drawerWidth = 240;

const useStyles = makeStyles(theme => ({
    drawer: {
      width: drawerWidth,
      flexShrink: 0,
      whiteSpace: 'nowrap',
    },
    drawerOpen: {
      width: drawerWidth,
      transition: theme.transitions.create('width', {
        easing: theme.transitions.easing.sharp,
        duration: theme.transitions.duration.enteringScreen,
      }),
    },
    drawerClose: {
      transition: theme.transitions.create('width', {
        easing: theme.transitions.easing.sharp,
        duration: theme.transitions.duration.leavingScreen,
      }),
      overflowX: 'hidden',
      width: theme.spacing(7) + 1,
      [theme.breakpoints.up('sm')]: {
        width: theme.spacing(9) + 1,
      },
    },
  }));

export default function SideDrawer(props) {
    const classes = useStyles();

    return (
        <Drawer
        variant="permanent"
        className={clsx(classes.drawer, {
            [classes.drawerOpen]: props.open,
            [classes.drawerClose]: !props.open,
          })}
          classes={{
            paper: clsx({
              [classes.drawerOpen]: props.open,
              [classes.drawerClose]: !props.open,
            }),
          }}
        open={props.open}
      >
        <div>
          <IconButton onClick={props.handleDrawerClose}>
            {props.theme.direction === 'rtl' ? <ChevronRightIcon /> : <ChevronLeftIcon />}
          </IconButton>
        </div>
        <Divider />
        <List>
            <ListItem button key='IceLand'>
              <ListItemIcon><AcUnitIcon/></ListItemIcon>
              <ListItemText primary='IceLand' />
            </ListItem>
        </List>
        <Divider />
        <List>
        <ListItem button key='Infinity'>
              <ListItemIcon><AllInclusiveIcon/></ListItemIcon>
              <ListItemText primary='Infinity' />
            </ListItem>
        </List>
      </Drawer>
    )
}
