(ns problem20)

(def test-cases
  '[(= (__ (list 1 2 3 4 5)) 4)
    (= (__ ["a" "b" "c"]) "b")
    (= (__ [[1 2] [3 4]]) [1 2])])

(def __
  (comp second reverse)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
