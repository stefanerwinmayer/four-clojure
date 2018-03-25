(ns problem21)

(def test-cases
  '[(= (__ '(4 5 6 7) 2) 6)
    (= (__ [:a :b :c] 0) :a)
    (= (__ [1 2 3 4] 1) 2)
    (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])])

(def __
  #(first (drop %2 %1))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
