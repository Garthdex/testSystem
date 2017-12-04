INSERT INTO `test_system`.`user`(`id`,`login`,`password`,`role`)
VALUES  (1,'Gleb','12345','admin');
INSERT INTO `test_system`.`user`(`id`,`login`,`password`,`role`)
VALUES (2,'Gooch','123','user');

INSERT INTO `test_system`.`test`(`id`,`name`)
VALUES (1,'Inf Bez');
INSERT INTO `test_system`.`test`(`id`,`name`)
VALUES (2,'PIS2');

INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(1,1,'Raw sauce?');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(2,1,'omae wa mou shindeiru?');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(3,1,'Yeah.....');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(4,1,'This is my own product ... !');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(5,2,'Pahnu voshititelno, ya rastu na ...');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(6,2,'Check ...');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(7,2,'I wanna keass your ...');
INSERT INTO `test_system`.`question`(`id`,`id_test`,`name`)
VALUES(8,2,'F-F-F-Fres.....');

INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(1,1,'No ketchup',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(2,1,'Just sauce',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(3,1,'Skiripi paf paf',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(4,1,'skya',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(5,2,'NANI?',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(6,2,'Vi sho, ebobo?',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(7,2,'Ruga waga kurae',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(8,2,'INAN?',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(9,3,'yea yea',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(10,3,'huje uje ne budet',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(11,3,'BOIIIIIIIIIIIIIII',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(12,3,'GIIIIIIIIIIIIIIRL',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(13,4,'BEACH!',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(14,4,'BICHT!',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(15,4,'BUTCHER!',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(16,4,'BITCH!',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(17,5,'solidole',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(18,5,'masterpone',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(19,5,'validole',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(20,5,'gidropone',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(21,6,'hello mf',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(22,6,'BAMF',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(23,6,'GGs',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(24,6,'please',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(25,7,'pops',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(26,7,'bobs',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(27,7,'milk',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(28,7,'cloth',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(29,8,'TAILO MUMAFO',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(30,8,'TAILO RAKAMAKAFO',true);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(31,8,'-_-',false);
INSERT INTO `test_system`.`answer`(`id`,`id_question`,`name`,`is_correct`)
VALUES(32,8,'ded doest',false);
