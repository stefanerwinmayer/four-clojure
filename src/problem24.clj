(ns problem24)

(def test-cases
  '[(= (__ [1 2 3]) 6)
    (= (__ (list 0 -2 5 5)) 8)
    (= (__ #{4 2 1}) 7)
    (= (__ '(0 0 -1)) -1)
    (= (__ '(1 10 3)) 14)])

(def __
  (partial reduce +)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
