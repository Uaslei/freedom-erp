GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAU;
GRANT UPDATE ON TABLE EQLOTE TO PROCEDURE EQMOVPRODATEQSP;
GRANT SELECT,UPDATE ON TABLE EQPRODUTO TO PROCEDURE EQMOVPRODATEQSP;
GRANT UPDATE ON TABLE EQSALDOPROD TO PROCEDURE EQMOVPRODATEQSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKCPSP TO TRIGGER EQMOVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKCPSP TO TRIGGER EQMOVPRODTGAU;
GRANT SELECT ON TABLE EQPRODUTO TO PROCEDURE EQMOVPRODCKCPSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODCKTMSP;
GRANT SELECT ON TABLE EQTIPOMOV TO PROCEDURE EQMOVPRODCKTMSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKUTMSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT ON TABLE EQTIPOMOV TO PROCEDURE EQMOVPRODCKUTMSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKTMSP TO PROCEDURE EQMOVPRODCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODDSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT DELETE ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODISP TO PROCEDURE EQMOVPRODIUDSP;
GRANT INSERT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSEQSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODDSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODISP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODUSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT,UPDATE ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODRETCODSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSEQSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE SGRETFILIAL TO PROCEDURE EQMOVPRODSEQSP;
GRANT EXECUTE ON PROCEDURE SPGERANUM TO PROCEDURE EQMOVPRODSEQSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQRELINVPRODSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODUSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKUTMSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE PVSEQM TO PROCEDURE OVCAIXASP;
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON FNRESTRICAO TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNTIPOCOB TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNCARTCOB TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE SGCALCVENCSP TO PROCEDURE FNGERAITRECEBERSP01;
COMMIT WORK;



