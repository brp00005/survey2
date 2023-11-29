;Author: Robert Coleman, coauthor: Branden Purdum
;Statement: This code follows the academic integrity policy

(defun same (list1 list2)
  (cond
    ((null list1) (null list2))
    ((null list2) nil)
    ((eql (car list1) (car list2))
     (same (cdr list1) (cdr list2)))
    (t nil)))

;;; Example Calls and Results:

;; Example 1: Both lists are empty
(format t "~a~%" (same '() '()))  ;; Output: T

;; Example 2: Lists have the same elements in the same order
(format t "~a~%" (same '(1 2 3) '(1 2 3))) ;; T

;; Example 3: Lists have the same elements but in a different order
(format t "~a~%" (same '(1 2 3) '(3 2 1))) ;; NIL

;; Example 4: One list is longer than the other
(format t "~a~%" (same '(1 2) '(1 2 3))) ;; NIL


;; Example 5: Lists have different elements
(format t "~a~%" (same '(1 2 3) '(4 5 6)))  ;; NIL