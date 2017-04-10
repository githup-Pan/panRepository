DROP TABLE IF EXISTS `user_test`;  
  
CREATE TABLE `user_test` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL unique,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user_t` */  
  
insert  into `user_test`(`user_name`,`password`,`age`) values ('panht','123456',24);
insert  into `user_test`(`user_name`,`password`,`age`) values ('liuyh','222222',25);