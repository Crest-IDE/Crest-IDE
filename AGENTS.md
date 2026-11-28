## Kotlin & Jetpack Compose
- **State Management**: Use reactive state flows (`StateFlow` / `collectAsStateWithLifecycle`). Minimize unnecessary recompositions.
- **Coroutines & Lifecycles**: Scope background work strictly to proper lifecycle coroutine scopes (`lifecycleScope`, `viewModelScope`).
- **Error Handling**: Never silently swallow exceptions. Always log or propagate errors to the UI when user feedback is required.
- **Code Preservation**: Maintain documentation and existing comments unless specifically modifying the associated logic. Explain *why* tricky code exists.

##  Modular Architecture & Component Naming (STRICT)
- **No Giant / God Files**: Never dump multiple complex widgets, dialogs, or state handlers into one massive screen file (e.g. 500+ lines). Split independent UI controls and widgets into dedicated, focused files under `ui/components/`.
- **Clean Idiomatic Naming (No Unnecessary Brand Prefixes)**:
  - Do NOT prefix generic, reusable components with `Crest...` (e.g. use `NumberField.kt`, `NumberStepper.kt`, `SegmentedControl.kt` — NOT `CrestNumberStepper.kt` or `CrestNumberField.kt`).
  - Reserve `Crest...` strictly for root-level brand entities (like `CrestTheme`, `CrestEditorApp`, `CrestFileDrawer`). Follow the clean conventions of Zed and VS Code.
- **Single Responsibility**: Keep component files focused, typically under 150–200 lines, with clean parameter contracts and zero hidden side effects.

## Icon Usage Standards (STRICT: Use In-House CrestIcons)
- **Always Use In-House Source Icons**: Always use the project's official in-house icon pack: `com.crestide.icons.CrestIcons` (based on Zed Editor & Lucide minimal 16x16 stroke vectors). It contains clean, stroke-based vector icons (e.g., `CrestIcons.Menu`, `CrestIcons.ArrowLeft`, `CrestIcons.ArrowRight`, `CrestIcons.Search`, `CrestIcons.ChevronDown`, `CrestIcons.KebabVertical`, `CrestIcons.Save`, `CrestIcons.SettingsGear`, `CrestIcons.Files`, `CrestIcons.Terminal`, etc.).
- **NO Third-Party Icon Packs**: NEVER introduce or import external third-party icon libraries or packs. Always check and use `CrestIcons` first.
-  **Avoid Random Material Icons**: Do NOT use random Android Material icons (`androidx.compose.material.icons.Icons.Default.*`) when an authentic editor icon exists in `com.crestide.icons.CrestIcons`.

