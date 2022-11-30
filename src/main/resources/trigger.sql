CREATE TRIGGER BINS_utilisateur
    BEFORE INSERT
    ON utilisateur FOR EACH ROW
    BEGIN
        DECLARE role_id INT;
            SELECT utilisateur.role_id
            INTO utilisateur

                IF (role_id != 1) THEN
                SIGNAL SQLSTATE'45000'
                SET MESSAGE_TEXT = "Mauvais role pour l'utilisateur";
                END IF;
    END;
