DELIMITER //

CREATE PROCEDURE impacta.prc_numero_descricao(IN p_numero INT, OUT p_descricao VARCHAR(100))
BEGIN

    DECLARE v_grupo_indice INT;
    DECLARE v_grupo_valor INT;
    DECLARE v_centena INT;
    DECLARE v_unidade INT;
    DECLARE v_dezena INT;

    SET p_descricao = "";
    SET v_grupo_indice = 2;

    REPEAT

        SET v_grupo_valor = (p_numero DIV POWER(1000, v_grupo_indice)) MOD 1000;
        SET v_centena = (v_grupo_valor DIV 100) MOD 10;
        SET v_dezena = (v_grupo_valor DIV 10) MOD 10;
        SET v_unidade = v_grupo_valor MOD 10;

        IF p_descricao <> "" AND v_grupo_valor > 0 THEN
            SET p_descricao = CONCAT(p_descricao, ", ");
        END IF;
        
        IF v_centena = 9 THEN
            SET p_descricao = CONCAT(p_descricao, "novecentos");
        ELSEIF v_centena = 8 THEN
            SET p_descricao = CONCAT(p_descricao, "oitocentos");
        ELSEIF v_centena = 7 THEN
            SET p_descricao = CONCAT(p_descricao, "setecentos");
        ELSEIF v_centena = 6 THEN
            SET p_descricao = CONCAT(p_descricao, "seiscentos");
        ELSEIF v_centena = 5 THEN
            SET p_descricao = CONCAT(p_descricao, "quinhentos");
        ELSEIF v_centena = 4 THEN
            SET p_descricao = CONCAT(p_descricao, "quatrocentos");
        ELSEIF v_centena = 3 THEN
            SET p_descricao = CONCAT(p_descricao, "trezentos");
        ELSEIF v_centena = 2 THEN
            SET p_descricao = CONCAT(p_descricao, "duzentos");
        ELSEIF v_centena = 1 THEN
            IF v_dezena > 0 OR v_unidade > 0 THEN
                SET p_descricao = CONCAT(p_descricao, "cento");
            ELSE
                SET p_descricao = CONCAT(p_descricao, "cem");
            END IF;
        END IF;

        IF p_descricao <> "" AND v_dezena > 0 THEN
            SET p_descricao = CONCAT(p_descricao, " e ");
        END IF;
        
        IF v_dezena = 9 THEN
            SET p_descricao = CONCAT(p_descricao, "noventa");
        ELSEIF v_dezena = 8 THEN
            SET p_descricao = CONCAT(p_descricao, "oitenta");
        ELSEIF v_dezena = 7 THEN
            SET p_descricao = CONCAT(p_descricao, "setenta");
        ELSEIF v_dezena = 6 THEN
            SET p_descricao = CONCAT(p_descricao, "sessenta");
        ELSEIF v_dezena = 5 THEN
            SET p_descricao = CONCAT(p_descricao, "cinquenta");
        ELSEIF v_dezena = 4 THEN
            SET p_descricao = CONCAT(p_descricao, "quarenta");
        ELSEIF v_dezena = 3 THEN
            SET p_descricao = CONCAT(p_descricao, "trinta");
        ELSEIF v_dezena = 2 THEN
            SET p_descricao = CONCAT(p_descricao, "vinte");
        ELSEIF v_dezena = 1 THEN
            IF v_unidade = 9 THEN
                SET p_descricao = CONCAT(p_descricao, "dezenove");
            ELSEIF v_unidade = 8 THEN
                SET p_descricao = CONCAT(p_descricao, "dezoito");
            ELSEIF v_unidade = 7 THEN
                SET p_descricao = CONCAT(p_descricao, "dezessete");
            ELSEIF v_unidade = 6 THEN
                SET p_descricao = CONCAT(p_descricao, "dezesseis");
            ELSEIF v_unidade = 5 THEN
                SET p_descricao = CONCAT(p_descricao, "quinze");
            ELSEIF v_unidade = 4 THEN
                SET p_descricao = CONCAT(p_descricao, "quatorze");
            ELSEIF v_unidade = 3 THEN
                SET p_descricao = CONCAT(p_descricao, "treze");
            ELSEIF v_unidade = 2 THEN
                SET p_descricao = CONCAT(p_descricao, "doze");
            ELSEIF v_unidade = 1 THEN
                SET p_descricao = CONCAT(p_descricao, "onze");
            ELSEIF v_unidade = 0 THEN
                SET p_descricao = CONCAT(p_descricao, "dez");
            END IF;
        END IF;

        IF v_dezena <> 1 THEN
            IF p_descricao <> "" AND v_unidade <> 0 THEN
                SET p_descricao = CONCAT(p_descricao, " e ");
            END IF;
        
            IF v_unidade = 9 THEN
                SET p_descricao = CONCAT(p_descricao, "nove");
            ELSEIF v_unidade = 8 THEN
                SET p_descricao = CONCAT(p_descricao, "oito");
            ELSEIF v_unidade = 7 THEN
                SET p_descricao = CONCAT(p_descricao, "sete");
            ELSEIF v_unidade = 6 THEN
                SET p_descricao = CONCAT(p_descricao, "seis");
            ELSEIF v_unidade = 5 THEN
                SET p_descricao = CONCAT(p_descricao, "cinco");
            ELSEIF v_unidade = 4 THEN
                SET p_descricao = CONCAT(p_descricao, "quatro");
            ELSEIF v_unidade = 3 THEN
                SET p_descricao = CONCAT(p_descricao, "tres");
            ELSEIF v_unidade = 2 THEN
                SET p_descricao = CONCAT(p_descricao, "dois");
            ELSEIF v_unidade = 1 THEN
                SET p_descricao = CONCAT(p_descricao, "um");
            END IF;
        END IF;

        IF v_grupo_indice = 2 AND v_grupo_valor > 1 THEN
            SET p_descricao = CONCAT(p_descricao, " milhões");
        ELSEIF v_grupo_indice = 2 AND v_grupo_valor = 1 THEN
            SET p_descricao = CONCAT(p_descricao, " milhão");
        ELSEIF v_grupo_indice = 1 AND v_grupo_valor > 0 THEN
            SET p_descricao = CONCAT(p_descricao, " mil");
        END IF;

        SET v_grupo_indice = v_grupo_indice - 1;

    UNTIL (v_grupo_indice < 0) END REPEAT;
    
    IF p_descricao = "" THEN
        SET p_descricao = "zero";
    END IF;

END//

DELIMITER ;
