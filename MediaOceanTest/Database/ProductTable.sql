CREATE TABLE `ProductTable` (
  `ProductID` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(45) NOT NULL,
  PRIMARY KEY (`ProductID`),
  UNIQUE KEY `ProductName_UNIQUE` (`ProductName`)
) 

