package ar.edu.ub.testing2018.Students;

/**
 * Created by drenard on 09/03/2018.
 */
public class CStudentStatistics2018 extends CStudentStatistics
{
    public CStudentStatistics2018()
    {
        IStudent alex = addStudent(new CStudentAlexanderLehmacher());
        IStudent ferr = addStudent(new CStudentFernandoRomero());
        IStudent walt = addStudent(new CStudentWalterDuartes());
        IStudent gabl = addStudent(new CStudentGabrielLozano());
        IStudent gabe = addStudent(new CStudentGabrielEspina());
        IStudent seba = addStudent(new CStudentSebastianWrzesinski());
        IStudent pedr = addStudent(new CStudentPedroRodriguez());

        // Diagnostic
        alex.gradeClass(0, 11, 0, 0, 0, 0, 0, 0);
        ferr.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        walt.gradeClass(0, 100, 0, 0, 0, 0, 0, 0);
        gabl.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        gabe.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        seba.gradeClass(0, 0, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(0, 0, 0, 0, 0, 0, 0, 0);

        // Class 1
        alex.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        ferr.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        walt.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        gabl.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        gabe.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        seba.gradeClass(1, 1, 1, 0, 0, 0, 0, 0);
        pedr.gradeClass(1, 1, 1, 0, 0, 0, 0, 0);

        // Class 2
        alex.gradeClass(2, 0, 0, 10, 10, 0, 0, 0);
        ferr.gradeClass(2, 0, 0, 10, 10, 10, 10, 0);
        walt.gradeClass(2, 0, 0, 10, 10, 10, 10, 0);
        gabl.gradeClass(2, 0, 0, 0, 0, 0, 0, 0);
        gabe.gradeClass(2, 0, 0, 10, 10, 10, 10, 0);
        seba.gradeClass(2, 0, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(2, 0, 0, 0, 0, 0, 0, 0);
    }
}
