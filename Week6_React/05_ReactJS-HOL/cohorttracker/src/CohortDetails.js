import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails(props) {
  let ongoing = props.cohort.currentStatus === "Ongoing";
  let style = { color: ongoing ? "green" : "blue" };
  return (
    <div className={styles.Box}>
      <h3 style={style}>
        {props.cohort.cohortCode} -{" "}
        <span style={style}>{props.cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{props.cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{props.cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{props.cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{props.cohort.trainerName}</dd>
      </dl>
    </div>
  );
}
export default CohortDetails;
