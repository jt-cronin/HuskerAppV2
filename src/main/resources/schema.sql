-- CREATE SCHEDULE TABLE
CREATE TABLE T_SCHEDULE
(
    GAME_ID         int          NOT NULL,
    GAME_DATE       varchar(max) NOT NULL,
    OPPONENT        varchar(max)  NOT NULL,
    LOCATION        varchar(6)   NOT NULL,
    GAME_TIME       varchar(max) NOT NULL,
    WINNER          varchar(max) NOT NULL,
    SPREAD          int          NULL,
    HUSKER_SCORE    int          NULL,
    OPPONENT_SCORE  int          NULL,
    ROW_CREATE_TSP  datetime     NOT NULL,
    PRIMARY KEY (GAME_ID)
);

-- CREATE PARTICIPANT TABLE
CREATE TABLE T_PARTICIPANT
(
    PERSONID            int          NOT NULL,
    NAME                varchar(max) NOT NULL,
    RECORD_PREDICTED    varchar(max) NOT NULL,
    OFFENSE_PREDICTED   numeric      NOT NULL,
    POINTS              int          NULL,
    PRIMARY KEY (PERSONID)
);

CREATE TABLE T_PREDICTIONS
(
    PREDICTION_ID       int             NOT NULL,
    GAME_ID             int             NOT NULL    references T_SCHEDULE(GAME_ID),
    PERSONID           int             NOT NULL    references T_PARTICIPANT(PERSONID),
    WINNER_PREDICTED    VARCHAR(max)    NOT NULL,
    SPREAD_PREDICTED    VARCHAR(max)    NULL,
    ACTUAL_WINNER       VARCHAR(max)    NULL,
    ACTUAL_SPREAD       int             NULL,
    POINTS_WINNER       int             NULL,
    POINTS_SPREAD       int             NULL,
    PRIMARY KEY (PREDICTION_ID)
);