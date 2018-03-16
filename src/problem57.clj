(ns problem57)

(def test-cases
  '[(= __
       ((fn foo [x]
          (when (> x 0)
            (conj (foo (dec x))
                  x)))
         5))])

(def __
  '(5 4 3 2 1)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
