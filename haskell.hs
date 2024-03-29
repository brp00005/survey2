--Authors: Branden Purdum and Robert Coleman
--Statement: This code follows the academic integrity policy

-- Function signature: header, pass two int lists and return bool
same :: [Int] -> [Int] -> Bool 

-- Both lists are empty: return true 
same [] [] = True

-- First list is empty, second list is not: return false
same [] _ = False

-- First list is not empty, second list is empty: return false 
same _ [] = False 

-- Recursive comparison
same (a:as) (b:bs)
  -- If a does not equal b, return false; if they're equal, continue recursively
  | a /= b    = False 
  | otherwise = same as bs

main :: IO ()
main = do
  print (same [] [])        -- Should return True
  print (same [1, 2] [])     -- Should return False
  print (same [] [1, 2])     -- Should return False
  print (same [1, 2, 3] [1, 2, 3]) -- Should return True
  print (same [1, 2, 3] [1, 2, 4]) -- Should return False


