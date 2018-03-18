(ns problem27)

(def test-cases
  '[(false? (__ '(1 2 3 4 5)))
    (true? (__ "racecar"))
    (true? (__ [:foo :bar :foo]))
    (true? (__ '(1 1 3 3 1 1)))
    (false? (__ '(:a :b :c)))])

(def __
  #(= (seq %) (reverse %))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
