SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0//
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0//

INSERT INTO `task` (`user`, `action`, `done`)
  VALUES 
    ( 'sergio', 'Buy flowers', false ),
    ( 'sergio', 'Get shoes', false ),
    ( 'sergio', 'Collect tickets', true ),
    ( 'sergio', 'Call Joe', false),
    ( 'sergio', 'Running', false)
//

SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS//
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS//