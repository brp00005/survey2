;Author: Branden Purdum, coauthor: Robert Coleman

;function header 
(defn same
  "Compare two lists"
  [list1 list2]
; Edge case: Are both lists empty? If so, return true.
  (if (and (empty? list1) (empty? list2))
    true ; Return true if both lists are empty

  ; Edge case 2: If only one of the lists is empty, return false.
    (if (or (empty? list1) (empty? list2))
      false ; Return false if one of the lists is empty

    ; If the first elements of list1 and list2 are the same, recursively call the same function with the rest of the lists
      (if (= (first list1) (first list2))

      ;recursively call `same` for the rest of the lists (sublists)
        (same (rest list1) (rest list2))

      ; if it makes it here, return false 
        false))))

;>5 non-trivial test cases, also testing edge cases
(println (same '(3 2 7 6 7) '(3 2 7 6 7)))
(println (same '(30 31 32) '()))
(println (same '() '()))
(println (same '(1 2 5) '(1 2)))
(println (same '(1 2 5) '(1 2 5)))
(println (same '(12 5 12) '(1 2 5)))

;; expected results, as well as actual results (they match)
;; true
;; false
;; true
;; false
;; true
;; false
