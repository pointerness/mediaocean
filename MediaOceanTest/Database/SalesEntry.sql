CREATE TABLE `SalesEntry` (
  `SalesId` int(11) NOT NULL AUTO_INCREMENT,
  `DateofSale` date DEFAULT NULL,
  `ProductID` int(11) DEFAULT NULL,
  `SaleAmount` int(11) DEFAULT NULL,
  PRIMARY KEY (`SalesId`),
  UNIQUE KEY `SalesId_UNIQUE` (`SalesId`),
  KEY `fk_SalesEntry_1` (`ProductID`),
  CONSTRAINT `fk_SalesEntry_1` FOREIGN KEY (`ProductID`) REFERENCES `ProductTable` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE
)