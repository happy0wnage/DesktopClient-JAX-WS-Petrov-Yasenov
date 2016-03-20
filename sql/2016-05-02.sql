-- MySQL dump 10.13  Distrib 5.7.10, for Win64 (x86_64)
--
-- Host: localhost    Database: movie_keep
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `description` longtext NOT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Выживший','Легенда хью Гласса',2015),(2,'Марсианин','Попал на марс',2015),(3,'Король шаманов','Король шаманов',2009),(4,'Настоящий детектив','Настоящий детектив',2014),(5,'Шпионский мост','Действие фильма происходит на фоне серии реальных исторических событий и рассказывает о бруклинском адвокате Джеймсе Доноване, который оказывается в эпицентре холодной войны, когда ЦРУ отправляет его на практически невозможное задание - договориться об освобождении захваченного в СССР американского пилота самолета-разведчика U2.',2015),(6,'Пещера','В лесных дебрях Румынии группа ученых наталкивается на руины аббатства XIII века. Обследовав их, они совершают удивительное открытие — это сооружение было построено над входом в гигантский подземный грот. А по мнению местных биологов, в гроте существует уникальная и еще не познанная экосистема. В итоге они отправляются выведывать ее тайны вместе с американскими спелеологами — Джеком, его братом Тайлером и группой лучших в мире ныряльщиков. В их распоряжении — самое современное оборудование, с помощью которого можно в течение 24 часов оставаться под водой. Оказавшись в гроте, исследователи, к своему ужасу, находят не новую экосистему, а невиданных доселе существ…',2005),(7,'Война на Диком Западе','Повествование этой кинокартины начинается с 1830-го года, с момента прибытия семьи переселенцев из Европы в Америку. Перед зрителями проходит жизнь первых поколений переселенцев, на плечи которых легло нелегкое бремя освоения Дикого запада. Под руководством четырех ведущих режиссеров США целое созвездие актеров воплотили на экране пятьдесят трудных и интересных лет жизни одной семьи переселенцев.',1962),(8,'Здравствуй, папа, Новый год','Отец двоих детей возвращается к своей бывшей жене, которая успела выйти замуж, и теперь его ждет соперничество с отчимом за внимание своих отпрысков.',2015),(9,'Грязная ложь','Младшему помощнику босса было доверено ожерелье ценой в 1 миллион долларов, однако кто-то из товарищей обворовал его...\r\n',2016),(10,'Анархисты ','Париж, 1899 год. Выросший в нищете сирота, а ныне командир отделения жандармерии Жан Альбертини должен проникнуть в группу анархистов. Для него это реальная возможность подняться по карьерной лестнице. Но чем дальше, тем больше у него возникает сомнений. По мере того как Жан составляет полицеские рапорты на преступную группировку для своего начальника Гаспара, он сам начинает все больше симпатизировать им.',2015),(11,'Желание ','По роману «Скука» Альберто Моравиа.\r\nПреподаватель философии Мартин переживает острый кризис среднего возраста. Он уже давно не испытывает никаких чувств к своей жене и все чаще переживает приступы безудержной ярости. Ему крайне необходима встряска, и он получает ее, познакомившись с Сесилией. По слухам, она настолько ненасытна в любви, что это стоило жизни ее предыдущему любовнику.\r\nРоман «Скука» Альберто Моравиа уже экранизировался в 1963 году итальянским режиссёром Дамиано Дамиани, но в те времена, ещё до наступления «сексуальной революции» в жизни и на экране, запутанные эротические отношения между сорокалетним философом-интеллектуалом и семнадцатилетней бывшей натурщицей, не отягощённой ни мыслями, ни чувствами, были представлены, разумеется, морально адаптированными..',1998),(12,'Гробница Лигейи','Верден Фелл, ученый — египтолог, женится вторично после смерти своей горячо любимой жены Лигейи, увлекавшейся оккультизмом. Последними словами Лигейи были «Смерти себя не предаю». И вот, по прошествии некоторого времени, Фелл начинает замечать что у его новой жены начинают проявляться черты Лигейи...',1964),(13,'Свидетель ','Девятилетний мальчик становится свидетелем зверского убийства: прямо на его глазах в туалете филадельфийского вокзала два человека безжалостно зарезали молодого мужчину. Оказывается, убитый был тайным агентом отдела по борьбе с наркотиками. Теперь мальчик — единственный свидетель, который может помочь детективу Джону Буку найти преступников.\r\nЛицо одного убийцы навсегда впечаталось в детскую память. И мальчик увидел его снова, когда его привезли для дачи показаний в местный полицейский участок — он увидел фото убийцы на доске почета полицейского управления. С этой минуты за маленьким свидетелем и его единственным защитником, инспектором Буком, начинается охота.',1985);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_user`
--

DROP TABLE IF EXISTS `movie_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_user` (
  `id_movie` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_movie`,`id_user`),
  KEY `fk_movie_has_user_user1_idx` (`id_user`),
  KEY `fk_movie_has_user_movie_idx` (`id_movie`),
  CONSTRAINT `fk_movie_has_user_movie` FOREIGN KEY (`id_movie`) REFERENCES `movie` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movie_has_user_user1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_user`
--

LOCK TABLES `movie_user` WRITE;
/*!40000 ALTER TABLE `movie_user` DISABLE KEYS */;
INSERT INTO `movie_user` VALUES (1,1),(3,1),(7,1),(9,1),(11,1),(1,2);
/*!40000 ALTER TABLE `movie_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(120) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'petrovva95@gmail.com','1234'),(2,'yasenovav@mail.ru','1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-20 22:39:27
